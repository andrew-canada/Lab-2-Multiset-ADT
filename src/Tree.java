import java.util.ArrayList;
import java.lang.Integer;

public class Tree {
    private Integer root;
    private ArrayList<Tree> subtrees;
    private int size;

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

    public String toString(int depth) {
        if(this.isEmpty()) {

        }
    }

    public boolean insertChild(int item, int parent) {
        if (this.isEmpty()) {
            return false;
        } else if (root == parent) {
            subtrees.add(new Tree(item, new ArrayList<Tree>()));
            return true;
        } else {
            for (Tree subtree: subtrees) {
                if (subtree.insertChild(item, parent)) {
                    return true;
                    }
                }
            return false;
            }
        }
    }

    def insert_child(self, item: int, parent: int) -> bool:
            """Insert <item> into this tree as a child of <parent>.

        If successful, return True. If <parent> is not in this tree,
        return False.

        If <parent> appears more than once in this tree, <item> should only
        be inserted once (you can pick where to insert it).
        """
            if self.is_empty():
            return False
    elif self._root == parent:
            self._subtrees.append(Tree(item, []))
            return True
        else:
                for subtree in self._subtrees:
            if subtree.insert_child(item, parent):
            return True
            return False

}
