Métodos que são invocados a partir da classe e não de um objeto, são os métodos estáticos. Usamos quando temos uma função, valor e dentre outros, que iremos usar em várias partes do código. Nisso, criamos uma classe justamente para armazenar esses métodos estáticos:

```
public class MatematicaUtil(){
	public static double PI = 3.14;

	public static int somar(int v1, int v2){
		return v1 + v2;
	}
...

}
```

Claro, esses dados podem ser usados em métodos de outras classes. É chamado pela própria classe.
Veja:

```
public class Exemplo(){
	...
	System.out.println("Somar dois valores: " + MatematicaUtil.somar(A, B));
}
```

Muitas vezes, nem sempre o static será usado para as funções descritas acima. Em usos mais específicos, podemos deixá-lo em uma classe normal e privado. Será usado para alguma coisa dentro da própria classe ou fora, de forma fixa: todos os objetos criados terão esse mesmo valor (ele será compartilhado entre todos objetos). É como se o atributo static estivesse em uma área separada do objeto, compartilhada por todos objetos instanciados da classe.

![[Pasted image 20250605103632.png]]

Agora, para a parte de constantes. Quando temos um atributo que não deve ser alterado, usa-se *final* para dizer que é uma constante. Logo, não será alterado. Por padrão, as variáveis com static tem suas letras todas maiúsculas.

```
public class Aluno(){
	public static final String FACULDADe = "UNESP - FCT";
	...
}
```

