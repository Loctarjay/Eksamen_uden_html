package ADT_COLL;

public interface IADT<T> {

    void create (T t);

    void deleteById(int id);

    void findById(int id);

    void update(T t);

}
