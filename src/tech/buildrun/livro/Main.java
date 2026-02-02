package tech.buildrun.livro;

public class Main {
    public static void main(String[] args) {

        Livro hobbit = new Livro("The Hobbit","Tolkien",1937);
    //    hobbit.setTitulo("The Hobbit");
    //    hobbit.setAutor("Tolkien");
    //    hobbit.setAnoPublicado(1937);

        hobbit.status();
    }
}
