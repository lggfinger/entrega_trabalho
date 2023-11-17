document.addEventListener("DOMContentLoaded", function () {
    var messageElement = document.getElementById("message");
    var params = new URLSearchParams(window.location.search);

    if (params.has("message")) {
        var message = params.get("message");
        console.log(message);
        messageElement.innerText = message;
    } else {
        messageElement.innerText = "Mensagem não encontrada.";
    }
});