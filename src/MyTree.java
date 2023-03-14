public class MyTree {
    private final int size;

    MyTree(int size) {
        this.size = size - 1;
    }

    public String constructTree()    {
        return constructBranch() + constructBody();
    }

    private String constructTriangle(int limit, int count, StringBuilder accumulator) {
        return count < limit ? constructTriangle(
                limit,
                count+1,
                accumulator.append("  ".repeat(size - count - 1))
                            .append("* ".repeat(count * 2 + 1))
                            .append("\n"))
                : accumulator.toString();
    }

    private String constructBody() {
        return constructTriangle(2, 0, new StringBuilder());
    }

    private String constructBranch() {
        return constructTriangle(size, 0, new StringBuilder());
    }

    public static void main(String[] args) {
        MyTree t1 = new MyTree(4);
        System.out.println(t1.constructTree());
    }
}