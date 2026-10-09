/*
 * Question: Program for thread synchronization using synchronized block (classes renamed with a 'Block' prefix so both synchronization programs can sit in the same folder)
 */

package JavaLabPrograms2;

import java.io.*;
class BlockSyncThread
{
    void call(String name)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("thread " + name);
        }
    }
}
class BlockMyThread extends Thread
{
    BlockSyncThread st;
    String s;
    BlockMyThread(BlockSyncThread st1, String s1)
    {
        st = st1;
        s = s1;
    }
    public void run()
    {
        synchronized (st)       // synchronized block
        {
            st.call(s);
        }
    }
}
class TestSyncBlock
{
    public static void main(String args[])
    {
        BlockSyncThread st = new BlockSyncThread();

        BlockMyThread t = new BlockMyThread(st, "hai");
        BlockMyThread t1 = new BlockMyThread(st, "hello");
        BlockMyThread t2 = new BlockMyThread(st, "welcome");
        t.start();
        t1.start();
        t2.start();
    }
}
