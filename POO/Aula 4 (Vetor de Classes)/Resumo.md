Originalmente, na declaração, não precisamos ter o tamanho do vetor:
```
Alunos vetor[];
```
Veja que nessa declaração, criamos um ponteiro do tipo classe Alunos que irá, ainda, apontar para alguma coisa. Veja:
```
vetor = new Alunos[5];
```
Nessa etapa, o ponteiro já aponta para cinco outros ponteiros vazios.

![[Pasted image 20250530220819.png]]

A partir daí, ainda não conseguimos usar o vetor. Como cada ponteiro do vetor ainda é nulo, temos que instanciá-lo para a classe desejada. Faremos isso:

![[Pasted image 20250530221220.png]]

Veja que, em casos onde vamos receber um vetor para estruturas já criado, não precisamos criar novamente com o *new*. Veja esse exemplo:

```
public void adicionarFuncionario(Funcionario f) {
        if (contador < funcionarios.length) {
            funcionarios[contador++] = f;
        } else {
            System.out.println("Limite de funcionários atingido para este departamento.");
        }
    }
```

Fora isso, surge uma dúvida: como acessar os objetos, já que agora são vários vetores apontando para estruturas formadas por uma classe? É simples. Apenas coloque o índice, dizendo de qual ponteiro estamos falando. Veja:

```
float s = 0;
for(int i = 0; i < 5; i++){
	s += vetor[i].media();
}
```

Perceba que não é `vetor.media()` e, sim, `vetor[i].media()`. E, outro detalhe, caso alguma daquelas posições no exemplo acima do *for* não estiver instanciada, irá dar erro por estar mexendo com ponteiro nulo. Resolvemos isso de duas formas: verificando se o ponteiro é nulo ou, simplesmente, tendo um contador que é incrementado quando há uma instanciação no vetor.



Agora, entendido o conteúdo principal desta aula, temos algumas observações práticas.