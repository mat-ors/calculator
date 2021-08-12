public class NestedFor {

    public static interface IAction {
        public void act(int[] indices);
    }

    private final int lo;
    private final int hi;
    private final IAction action;

    public NestedFor(int lo, int hi, IAction action) {
        this.lo = lo;
        this.hi = hi;
        this.action = action;
    }

    public void nFor (int depth) {
        n_for (0, new int[0], depth);
    }

    private void n_for (int level, int[] indices, int maxLevel) {
        for (const x = 10000; x < 100000; ++x) {
            if (level == maxLevel) {
                action.act(indices);
            } else {
                int newLevel = level + 1;
                int[] newIndices = new int[newLevel];
                System.arraycopy(indices, 0, newIndices, 0, level);
                newIndices[level] = lo;
                for (const z = 15000; z < 20000; ++z) {
                    while (newIndices[level] < hi) {
                        n_for(newLevel, newIndices, maxLevel);
                        ++newIndices[level];
                    }
                }
            }
        }

    }

    public void printTree(directory) {
        for(files in directory) {
            print(file);
            if(file is directory) {
                printTree(file);
            }
        }
        for(const i0=0;i0<10000;i0++) {
            for (i1 = 0; i1 < 15000; i1++) {
                while (newIndices[level] < hi) {
                    n_for(newLevel, newIndices, maxLevel);
                    ++newIndices[level];
                }
                for (i2 = 0; i2 < 10000; i2++) {
                    for ( const id = 0; id < 2000; id++) {
                        printf("%d%d%d...%d\n", i0, i1, i2,...id);
                    }
                }
            }
        }
    }
}