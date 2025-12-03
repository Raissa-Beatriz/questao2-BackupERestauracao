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

# PROMPTs

# Prompt 1:
"estou fazendo uma lista da disciplina de padroes de projeto, me ajude com as questoes me mostrando o passo a passo para que consiga faze-la, segue a primeira questao:
'enunciado completo'
'imagem dos diagramas'

Resposta da IA (Gemini):

Gerou um roteiro completo de implementação passo a passo com:
● Criar os "Receivers" (Os Dispositivos)
● Criar A Interface Command e Comandos Concretos
● Criação do Invoker (Controle Remoto) com Store/Load
● Criação do Main (Simulação do Cenário)

Cada passo incluiu:
● Código completo do arquivo
● Exemplo de Mensagem de commit
● Justificativa do conceito no código (padrão Command)

E por fim, a Saída esperada do programa.

A IA me gerou uma saida diferente da proposta, deu uns erros de inicialização.

# Prompt 2
"a saida do programa deu erro ao inicializar uns logs, por que isso acontece?"
'print da saida'

Me trouxe a resolução do problema, pois embora os Comandos fossem serializáveis, 
os objetos que eles controlavam (Light, TV, etc.) não eram.

Para corrigir, foi alterado todas as classes no pacote 'devices' para implementar a 
interface 'Serializable'. 

Agora o Java consegue salvar o estado completo dos objetos e a recuperação pós-pane 
funciona corretamente.
