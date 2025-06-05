***Objetos***: quando criamos um ponteiro para com um tipo de determinada classe.

***Classe abstrata e método abstrato:*** A classe abstrata

***StringBuilder*** =  uma classe para assumir.

***Protected*** = apenas aqueles do mesmo pacote irão conseguir acessar a classe ou método.

***Encapsulamento*** = torna um atributo da classe privado. Quando isso acontece, só a classe em si tem acesso à eles. Nesses casos, muitas vezes usamos os *set's* que criamos na classe para alterar os valores quando estamos em outra classe.

***Classes Iniciais*** = para haver uma boa organização nos arquivos, crie:
* Uma classe Principal: ela irá criar a *main* e, dentro dela, um ponteiro para uma classe Sistema. Depois, irá executar um método *executar()* que irá ser o código de fato. Muitas vezes, esse código será da interface de texto (até chegarmos na parte da interface gráfica).
```
public class Principal{
	public static void main(String[] args){
		Sistema sis = new Sistema();
		sis.executar();
	}
}
```
* Uma classe Sistema: será aquela que irá ser chamada na principal. Deve conter dentro do método *executar()* todo o código.
```
public class Sistema{
	...
	void executar(){
		...
	}
}
```

***Objetos padrões*** = em Java, os tipos tem seus próprios objetos. Podemos aproveitar muitos.
Veja:

```
for(int i = 0; i < MAX; i++){
	if(alunos[i].getNome.equals(nome)){
		...
	}
}
```

Neste caso, o método *equals* compara a string *getNome* com o nome desejado. Podemos fazer bastante uso disso.







Prova:
* Só irá cair o conteúdo até programação em camadas. No entanto, tem que estar atento ao CASTING (porque não lembro muito bem).
	* "Não será cobrado o conteúdo de programação em camadas e nem interface gráfica."
	* O estudo começará a partir da aula 3.



Scanner:
* Para usar, primeiro importe: 
```
import java.util.Scanner;
```
* Depois, use diretamente quando for ler a próxima linha:
```
Scanner sc = new Scanner(System.in);
String nome = sc.nextLine();
```

Veja que, caso não fosse string aquilo que estamos querendo ler, mudaremos o objeto de *sc*:
`int op = sc.nextInt();`.





Na lista 5, o exercício 2) é muito parecido com o trabalho.

