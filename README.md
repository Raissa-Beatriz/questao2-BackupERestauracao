# questao2-BackupERestauracao

Enunciado - Backup e Restauração:

Algumas aplicações exigem que registremos todas as ações que foram executadas, e
sejamos capazes de se recuperar após uma falha, invocando novamente essas ações. 
O padrão command pode suportar essas funcionalidades com a adição de dois métodos: 
store() e load(). 

Como é que isso funciona? À medida que executamos comandos, armazenamos um
histórico deles no disco (através do método store(), em algum arquivo, por exemplo). 
Quando ocorre uma falha, recarregamos os objetos de comando (através do método load()), 
e invocamos os métodos execute() de cada comando na ordem em que foram armazenados.

Considerando o exemplo do controle remoto universal visto em aula, imagine que você
automatizou todos os dispositivos eletrônicos de sua residência. Após uma pane elétrica,
você gostaria que os seus dispositivos reiniciassem exatamente da forma que foram
configurados antes da pane elétrica.

● Você deverá simular essa solução de recuperação usando o padrão command com
as novas funcionalidades de store() e load().

● Você deverá implementar os dispositivos e seus comandos (similar ao que foi feito em
sala de aula) para todos os dispositivos do diagrama de classes abaixo:
"imagens das classes"

