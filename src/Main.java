import java.util.ArrayList;
import static java.lang.IO.*;

void main() {

    // listas
    ArrayList<Pessoa> banco = new ArrayList<>();
    ArrayList<Pessoa> cache = new ArrayList<>();

    // pessoas do banco
    Pessoa p1 = new Pessoa();
    p1.id = 1;
    p1.nome = "Vitor";
    p1.idade = 18;
    banco.add(p1);

    Pessoa p2 = new Pessoa();
    p2.id = 2;
    p2.nome = "Ryan";
    p2.idade = 20;
    banco.add(p2);

    Pessoa p3 = new Pessoa();
    p3.id = 3;
    p3.nome = "Paulo";
    p3.idade = 29;
    banco.add(p3);

    Pessoa p4 = new Pessoa();
    p4.id = 4;
    p4.nome = "Matheus";
    p4.idade = 22;
    banco.add(p4);

    Pessoa p5 = new Pessoa();
    p5.id = 5;
    p5.nome = "Lucas";
    p5.idade = 30;
    banco.add(p5);

    Pessoa p6 = new Pessoa();
    p5.id = 6;
    p5.nome = "Fiama";
    p5.idade = 27;
    banco.add(p6);

    Pessoa p7 = new Pessoa();
    p5.id = 7;
    p5.nome = "Igor";
    p5.idade = 16;
    banco.add(p6);

    // pedir ID
    int id = Integer.parseInt(readln("Digite o ID: "));

    // procurar no cache
    for (Pessoa pessoa : cache) {

        if (pessoa.id == id) {
            println("Pessoa encontrada no cache: " + pessoa.nome);
            return;
        }
    }

    // procurar no banco
    for (Pessoa pessoa : banco) {

        if (pessoa.id == id) {
            cache.add(pessoa);
            println("Pessoa buscada no banco e adicionada ao cache: " + pessoa.nome);
            return;
        }
    }

    println("Pessoa não encontrada.");
}