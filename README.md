# Welcome to RankedMusic


## Projeto para o processo seletivo de estágio da ESIG

Para o projeto, foram criadas 6 paginas JSF com Primefaces e com BootStrap, uma delas é o template, onde se repete em todas elas e uma tela apenas para controlar o funcionamento da tela da lista de musicas.

## 

Também foi utilizado o Maven para facilitar na questão dos downloads das dependências e arquivos jars necessários. O server utilizado foi o Tomcat, Java EE 7.

##  

Para mapear e relacionar com o banco de dados, poderia ter sido utilizado o Hibernate, porém algumas complicações impossibilitaram a utilização dele. Então uma classe se responsabiliza pela criação (abrir e fechar conexão) da conexão e class DAO se conecta individualmente quando necessário comandado pelo Bean.

##  É preciso a criação do schema no banco de dados MySQL
É preciso criar um banco com mesmo nome de "gerencia-musica" e com a tabela chamada "musica", ou deve ser alterado a String URL_CONEXAO do arquivo FabricaConexao para o novo esquema criado.
A tabela deve conter 4 colunas, sendo uma com o id, que auto incrementa e as demais com os nomes: "nome", "banda" e "nota".
A String USUARIO e String SENHA também devem ser alterados de acordo com o banco de dados.
## itens implementados(podendo ser melhorado):
- [x] A.
- [x] B.
- [ ] C.
- [ ] D.
- [ ] E.
- [x] F.
- [x] G.
- [ ] H.
- [ ] I.
- [ ] J.
- [ ] K.



# Downloads
- Apache Netbeans 11.1.
- Tomcat 8
- MySQL
- MySQL WorkBench 8
- Kit JDK

