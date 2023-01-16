Questão 19 - Escreva classes para satisfazer os seguintes papeis do padrão Builder:  

* Cliente: recebe como parâmetros o nome, endereço, telefone e e−mail de uma pessoa, soli cita ao diretor que construa informações de contato, recupera a informação do builder e imprime;  

* Diretor: recebe como parâmetro o builder a ser utilizado e os dados de contato. Manda o builder construir o contato;  

* Builder: constrói o contato. Existem três tipos de contato e um builder para cada tipo: Contato Internet: armazena nome e e−mail;  

Contato Telefone: armazena nome e telefone;  

Contato Completo: armazena nome, endereço, telefone e e−mail.  

A classe que representa o papel cliente deve ter o método main() que irá criar um diretor e um builder de cada tipo. Em seguida, deve pedir ao diretor que crie um contato de cada tipo e imprimi−los (use o toString() da classe que representa a informação de contato).


Question 19 - Write classes to satisfy the following Builder pattern roles:

* Client: receives as parameters the name, address, telephone and e−mail of a person, asks the director to build contact information, retrieves the information from the builder and prints it out;

* Director: receives as a parameter the builder to be used and the contact data. Have the builder build the contact;

* Builder: builds the contact. There are three types of contact and a builder for each type: Internet Contact: stores name and e−mail;

Contact Phone: stores name and phone;

Complete Contact: stores name, address, telephone and e−mail.

The class that represents the client role must have the main() method that will create a director and a builder of each type. Next, you must ask the director to create a contact of each type and print them out (use the toString() of the class that represents the contact information).