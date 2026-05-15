import java.util.ArrayList;

public class Tree {
    private Integer root;
    private ArrayList<Tree> subtrees;

    public Tree(Integer root) {
        this.root = root;
        this.subtrees = new ArrayList<Tree>();
    }

    public Tree(Integer root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int length() {
        if(this.isEmpty()) {
            return 0;
        } else {
            int size = 1;
            for(Tree tree: this.subtrees) {
                size += tree.length();
            }
            return size;
        }
    }

    public int count(int item) {
        if(this.isEmpty()) {
            return 0;
        } else {
            int num = 0;
            if (this.root == item) {
                num++;
            }
            for(Tree tree: this.subtrees) {
                num += tree.count(item);
            }
            return num;
        }
    }

    public String toString() {
        return this.toString(0);
    }

    private String toString(int depth) {
        if(this.isEmpty()) {
            return "";
        } else {
            String s = "";
            // TODO: complete this method.
        }
    }

    public double average() {
        if(this.isEmpty()) {
            return 0.0;
        } else {
            // TODO: complete this method
        }
    }

}
