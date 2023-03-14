import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyTreeTest {

    @Test
    void constructTree() {
        MyTree tree1 = new MyTree(4);
        MyTree tree2 = new MyTree(5);
        MyTree tree3 = new MyTree(6);
        assertEquals(tree1.constructTree(),
                """
                            *\s
                          * * *\s
                        * * * * *\s
                            *\s
                          * * *\s
                        """);
        assertEquals(tree2.constructTree(),
                """
                              *\s
                            * * *\s
                          * * * * *\s
                        * * * * * * *\s
                              *\s
                            * * *\s
                        """);
        assertEquals(tree3.constructTree(),
                """
                                *\s
                              * * *\s
                            * * * * *\s
                          * * * * * * *\s
                        * * * * * * * * *\s
                                *\s
                              * * *\s
                        """);
    }
}