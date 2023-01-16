Questão 20 - Construa um programa que receba como parâmetro um ou mais nomes, cada um podendo estar em um dos seguintes formatos: §” nome sobrenome”; §” sobrenome, nome”. Escreva duas aplicações de construção de nomes, uma para cada formato. Cada uma deve ser responsável por armazenar os nomes criados e imprimi-los quando requisitado. Implemente o padrão Factory Method de forma que somente a criação do nome seja delegada as aplicações concretas (subclasses). Seu programa deve criar as duas aplicações e construir objetos da classe Nome, que deve ter propriedades nome e sobrenome para armazenar as informações em separado. Os nomes não precisam ser impressos em ordem.  

Ex.:
java Names "McNealy, Scott" "James Gosling" "Naughton, Patrick"
James Gosling
Scott McNealy
Patrick Naughton


Question 20 - Build a program that receives one or more names as a parameter, each one of which can be in one of the following formats: §”first name last name”; §" Last name". Write two naming applications, one for each format. Each one must be responsible for storing the names created and printing them when required. Implement the Factory Method pattern so that only the creation of the name is delegated to concrete applications (subclasses). Your program must create the two applications and build objects of the Name class, which must have first and last name properties to store information separately. Names do not need to be printed in order.

Ex.:
java Names "McNealy, Scott" "James Gosling" "Naughton, Patrick"
James Gosling
Scott McNealy
Patrick Naughton