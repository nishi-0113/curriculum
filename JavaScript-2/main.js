const btn = document.getElementById("btn");

btn.addEventListener("click", function() {
    let raffle = ["大吉", "中吉", "凶"]

    var random = Math.floor(Math.random() * raffle.length)

    btn.innerHTML = raffle[random]




}, false);