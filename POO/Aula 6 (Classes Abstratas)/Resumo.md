Quando temos uma classe que não será instanciada, apenas usada como formato para novas classes filhas. Nesses casos, usamos classes abstratas.

```
public abstract class Produto(){
	...
}
```

Há certos detalhes importantes acerca dos métodos: há os métodos abstratos. Todos os métodos abstratos declarados não precisam ser implementados na própria classe - mas as filhas são obrigadas a representar.

``public abstract double valorFinal();``

Fora isso, o métodos que não forem abstratos terão o mesmo comportamento de métodos normais.
Uma coisa legal é que, caso um método da classe abstrata invoque - no seu corpo - algum método abstrato dessa mesma classe, ele poderá ser usado. Pois, afinal, o a classe filha que irá herdar e implementar esse método abstrato.

```
public abstract class Produto(){
	...
	public abstract double valorF();

	public void exibir(){
		...
		System.out.println("Valor final: " + valorF());
	}
	
}
```

