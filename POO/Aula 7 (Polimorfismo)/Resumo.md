É um toque geral de todas as aulas envolvendo herança até agora.

Quando criamos um vetor de uma superclasse, podemos instanciar as subclasses nele. Mas veja: a superclasse não tem acesso à métodos das subclasses. Portanto, teriamos que criar os métodos da superclasse na subclasse. Caso o método que queremos é justamente o da superclasse, então não há problema.

![[Pasted image 20250605080959.png]]

Aquilo que a gente chama de polimorfismo não é nada mais que o comportamento de ser várias coisas. Note que o ponteiro *IT* é polimórfico pois aponta tanto para a classe CD, em certos momentos, quanto para a classe Video. No entanto, é só mais um detalhe de nomenclatura e *IT* não precisaria existir para o programa funcionar (era só usar, por exemplo, ``itens[0].imprimir();)``.

Há também o *INSTANCEOF*, que é uma verificação do ponteiro para um tipo:

```
Funcionario f = new ProfessorComputacao();
if(f instanceof ProfessorFisioterapia){
	...
}
```

Note que, caso o ponteiro *f* fosse do tipo ProfessorFisioterapia, retornaria *TRUE*. Mas não é.
No entanto, veja:

![[Pasted image 20250605083017.png]]

Veja que retornará *TRUE*, pois ProfessorComputacao também é um professor. Uma forma de resolver isso é criar um atributo que fale o tipo daquela classe:

```
public class Funcionario(){
	private String tipo = "Funcionario";
	...
}
```

Para casos onde se tem um vetor de uma superclasse, e queremos realizar um método da superclasse filha (onde obviamente a mãe não tem acesso), temos que realizar o CAST:

```
Funcionario[] vetor = new Funcionario[MAX];

for(int i = 0; i < MAX; i++){
	if(vetor[i] instanceof ProfessorComputacao){
		...
		System.out.println("Calculo final: " + (ProfessorComputacao) vetor[i].CalculoFinal());
	}
}

```

O CAST tem que ser do tipo correto também. Não dá pra fazer CAST do tipo Funcionario para o tipo ProfessorComputacao.