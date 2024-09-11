public class LinkedListDeque<T> {
         T item;
         LinkedListDeque next;
         LinkedListDeque prior;
     public LinkedListDeque(T x,LinkedListDeque nnext,LinkedListDeque pprior)
    {
        item=x;
        next=nnext;
        prior=pprior;


    }



}
