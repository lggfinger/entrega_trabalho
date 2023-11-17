
Adivinhação - Jogo em Spring Boot

Bem-vindo ao jogo de adivinhação! Este é um simples jogo construído usando o framework Spring Boot, onde você tenta adivinhar um número secreto entre 1 e 10. A aplicação irá fornecer feedback sobre cada tentativa, indicando se o número é maior, menor ou se você acertou!

Como Jogar
Acesse a aplicação em http://localhost:8080 após iniciar o aplicativo Spring Boot.

Na página inicial, você verá uma mensagem convidando-o a tentar adivinhar o número entre 1 e 10.

Preencha o campo de adivinhação com um número de sua escolha e clique em "Enviar".

Com base na sua adivinhação, a aplicação responderá se o número é maior, menor ou se você acertou!

Continue tentando até acertar o número ou decidir reiniciar o jogo.

Detalhes Técnicos
O aplicativo é construído em Spring Boot, um framework Java que simplifica o desenvolvimento de aplicativos Java. A estrutura principal do jogo inclui:

GameController.java: Controlador Spring que lida com as solicitações da interface do usuário, gerencia o estado do jogo e fornece feedback ao usuário.

index.html: Página inicial que contém um formulário para inserir suas adivinhações.

guess-result.html: Página que exibe o resultado da adivinhação e fornece um link para reiniciar o jogo.

style.css: Folha de estilo para melhorar a apresentação visual do jogo.

processar.js: Script JavaScript que extrai a mensagem da URL para exibição na página de resultado.
