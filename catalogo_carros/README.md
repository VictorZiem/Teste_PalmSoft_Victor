# Catálogo carros CRUD
O presente projeto consiste em um CRUD de produtos utilizando o framework SpringBoot. Os produtos em questão são carros, cada um com um nome, preço e datas de criação e edição.

Com isso, é possível fazer as operações padrões de um CRUD: Criar novos carros, ver e atualizar as informações de um carro específico, deletar um carro do banco.

## Instalação
Antes de começar, certifique-se que tem o Open JDK 11 instalado.

Caso esteja usando Linux como seu SO, você pode baixá-lo utilizando o gerenciador de pacotes da sua distribuição.

No caso do windows, é possível baixar uma build feita pela microsoft do [OpenJDK 17](https://docs.microsoft.com/en-us/java/openjdk/download#openjdk-17)

Após a instalação do open JDK, baixe e descompacte esse projeto em algum lugar.

Então, vá para o diretório raiz do projeto (Aquele onde está o arquivo `pom.xml`) e abra um terminal nesse diretório (Use o bash caso esteja no Linux ou o git bash caso no windows).

Após abrir o terminal, será necessário instalar as dependências através do Maven:
- Caso use Windows, digite: `./mvnw.cmd clean install`
- Caso use Linux, digite: `./mvnw clean install`

Aguarde então até a execução completa do comando.

## Inicialização

Para iniciar o sistema, basta abrir um terminal no mesmo diretório aberto na hora da instalação e rodar:
- Caso use Windows: `./mvnw.cmd spring-boot:run`
- Caso use Linux: `./mvnw spring-boot:run`

