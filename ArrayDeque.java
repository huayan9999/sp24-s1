public class ArrayDeque<T> {
    LinkedListDeque sentinel;
    int size;
    public ArrayDeque()
    {
        sentinel=new LinkedListDeque<T>(null,sentinel,sentinel);
        size=0;
    }
    public void addFirst(T item)
    {
        LinkedListDeque p=new LinkedListDeque<T>(item,null,null);
        if(sentinel.next==null)
        {
            p.next=sentinel;
            sentinel.prior=p;
            sentinel.next=p;
            p.prior=sentinel;
        }else {
        p.next=sentinel.next;
        p.next.prior=p;
        sentinel.next=p;
        p.prior=sentinel;}
        size++;

    }
    public void addLast(T item)
    {
        LinkedListDeque p=new LinkedListDeque<T>(item,null,null);
        if(sentinel.next==null)
        {
            p.next=sentinel;
            sentinel.prior=p;
            sentinel.next=p;
            p.prior=sentinel;
        }else {
            p.prior = sentinel.prior;
            p.prior.next = p;
            sentinel.prior = p;
            p.next = sentinel;
            size++;
        }

    }
    public boolean isEmpty()
    {
        if(this.size==0)
        {
            return true;
        }
        else return false;

    }
    public int size()
    {
        return size;

    }
    public void printDeque()// Prints the items in the deque from first to last, separated by a space.
    {
        LinkedListDeque p=sentinel.next;
      /*  for(int i=0;i<size;++i)
        {
            System.out.println(p.item+" ");
        }*/
        while(p!=sentinel)
        {
            System.out.print(p.item+" ");
            p=p.next;

        }

    }
    //Removes and returns the item at the front of the deque. If no such item exists, returns null.
    public T removeFirst()
    {
        LinkedListDeque<T> p=sentinel.next;
        if(p==sentinel)
        {
            return null;

        }else {
            T item=p.item;
            sentinel.next=p.next;
            sentinel.next.prior=sentinel;
            size--;
            return item;

        }
    }
    public T removeLast()
    {
        LinkedListDeque<T> p=sentinel.prior;
        if(p==sentinel)
        {
            return null;
        }
        else{
            T item=p.item;
            sentinel.prior=p.prior;
            p.prior.next=sentinel;
            size++;
            return item;
        }
    }
    //Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
    public T get(int index)
    {
        if( index>=size)
        {
            return  null;

        }
        else{
            LinkedListDeque p=sentinel;
            for(int i=0; i<=index;++i)
            {
                p=p.next;
            }
            return (T)p.item;

        }
    }
}
