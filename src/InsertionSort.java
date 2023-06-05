
public class InsertionSort {
	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto ("Lamborghini", 1000000);
		produtos[1] = new Produto("Jipe", 46000);
	    produtos[2]= new Produto("Bras�lia", 16000);
	    produtos[3] = new Produto("Smart", 46000);
	    produtos[4] = new Produto("Fusca", 17000);
	    
	    int maisBarato = 0;
	    for(int atual = 0; atual <= 4; atual++){
	        if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
	            maisBarato = atual;
	        }
	    }
	    System.out.println(produtos[maisBarato].getName());
	    System.out.println("O carro mais barato custa "
	                                 + produtos[maisBarato].getPreco());
	}
}
