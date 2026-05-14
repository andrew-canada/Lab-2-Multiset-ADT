public class TreeMultiSet extends MultiSet {

    private Tree tree = new Tree();
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        tree.insert(item);
    }

    void remove(Integer item) {
        tree.delete_item(item);
    }

    boolean contains(Integer item) {
        return tree.contains(item);
    }

    boolean is_empty() {
        return tree.is_empty();
    }

    int count(Integer item) {
        return tree.count(item);
    }

    int size() {
        return tree.__len__();
    }
}
