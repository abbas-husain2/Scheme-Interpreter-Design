import syntaxtree.Node;
import visitor.Environment;
import visitor.GJDepthFirst;

public class Main {
    public static void main(String [] args) {
        try {
            Node root = new MiniSchemeParser(System.in).Goal();

            root.accept(new GJDepthFirst(),new Environment());
        }
        catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
}
