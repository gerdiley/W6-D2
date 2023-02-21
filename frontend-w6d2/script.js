var btn = document.getElementById("btn");

btn.addEventListener("click", ()=> {
    fetch("http://localhost:8084/get-people-json").then((res) => res.json()).then(
        response => { 

            for(i = 0; i < response.length; i++) {
                document.getElementById("main").innerHTML += `<div class="container d-flex justify-content-center">
                <p class="p-3">${response[i].id}</p>
                <p class="p-3">${response[i].fullname}</p>
                <p class="p-3">${response[i].username}</p>
            </div>`;
            }
            /* var res = JSON.parse(response);
            console.log(res);
            res.forEach(element => {
                document.getElementById("main").innerHTML = `<div class="container d-flex justify-content-center">
                <p class="p-3">${element.id}</p>
                <p class="p-3">${element.fullname}</p>
                <p class="p-3">${element.username}</p>
            </div>`;
                
            }); */
        }
    )
})