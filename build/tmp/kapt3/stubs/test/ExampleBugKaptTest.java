
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"LExampleBugKaptTest;", "", "()V", "example", "LExampleBugKaptTest$Companion$Example;", "example_test", "", "onBefore", "Companion", "bugkapt"})
@org.junit.runner.RunWith(value = org.junit.runners.JUnit4.class)
public final class ExampleBugKaptTest {
    private final ExampleBugKaptTest.Companion.Example example = ExampleBugKaptTest.Companion.Example.EXAMPLE_FAIL;
    public static final ExampleBugKaptTest.Companion Companion = null;
    
    @org.junit.Before()
    public final void onBefore() {
    }
    
    @org.junit.Test()
    public final void example_test() {
    }
    
    public ExampleBugKaptTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"LExampleBugKaptTest$Companion;", "", "()V", "Example", "bugkapt"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"LExampleBugKaptTest$Companion$Example;", "", "(Ljava/lang/String;I)V", "EXAMPLE_FAIL", "bugkapt"})
        public static enum Example {
            /*public static final*/ EXAMPLE_FAIL /* = new EXAMPLE_FAIL() */;
            
            Example() {
            }
        }
    }
}