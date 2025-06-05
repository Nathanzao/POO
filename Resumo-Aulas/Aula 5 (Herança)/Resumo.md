
Classes que herdam de outras classes. Em Java, utilizamos o **Extends**, no formato:

```
public class Arroz extends Comida{
	...
};
```

No geral, tem essas características:
* Uma classe filha herda todos os métodos da classe mãe *(superclasse)*.
	* **Caso queremos alterar algum método específico**, modificá-lo para corresponder ao uso daquela classe, simplesmente implementamos o método novamente. Dessa forma, quando chamarmos o método da classe filha *(subclasse)*, estaremos nos referindo ao método alterado e não ao método da classe mãe.
	* Caso quisermos utilizar exatamente o mesmo método da classe mãe, mas apenas mudando alguns detalhes, utilizamos o **Super**.
		* 
		```
		public class Arroz extends Comida
			public Arroz(){
				super();
				...
			}
		``` 
		* Veja que super, pode ser usado para chamar métodos da superclasse também.
			* O ato de usar **super** sem especificar o método, é porque você já especificou ele. É o construtor sem nada.
* Uma subclasse pode ser uma superclasse.
* Um vetor declarado como tipo de superclasse, pode referenciar uma subclasse. No entanto, para acessar esses métodos da subclasse no vetor da superclasse, precisamos fazer um cast. Veja:

	```
		public Conta contas[];
		contas = new Conta[max];
	
		contas[0] = new Conta("NathanZao", "123456", 321415);
	
		contas[1] = new ContaEspecial(-200 ,"Nathanzinho", "43252", 76564);
		        nome = contas[1].getCliente();
		        numero = contas[1].getNumero();
		        saldo = contas[1].getSaldo();
		        ContaEspecial ce  = (ContaEspecial) contas[1];
		        limite = ce.getLimite();
	```
	- Uma curiosidade: uma subclasse pode dar cast para a superclasse, mas uma superclasse não dá cast para a subclasse.


Caso temos uma função em uma classe que se refere à uma superclasse, as classes filhas também podem ser passadas com parâmetros pois são a superclasse também.
Veja:

```
public void adicionarFuncionario(Funcionario f){  
    if(contadorFuncionarios < MAX){  
        funcionarios[contadorFuncionarios] = f;  
    }else{  
        System.out.println("Erro. Máximo de funcionários atingido.\n");  
        return;  
    }  
}


tec = new Tecnico(nome, id, salario, func);
universi.departamentos[i].adicionarFuncionario(tec);
```

