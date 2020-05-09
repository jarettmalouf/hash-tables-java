// Implements a singly-linked list.

public class MyHashSet {
    private ListNode[] buckets;
    private int objCount;
    private double loadFactorLimit;

    // Constructor: creates an empty hash set with default parameters
    public MyHashSet()
    {
        this.buckets = new ListNode[10];
        this.objCount = 0;
        this.loadFactorLimit = 0.75;
    }

    // Constructor: creates a hash set with the given initial bucket size and load factor limit
    public MyHashSet(int bucketCount, double loadFactorLimit)
    {
        this.buckets = new ListNode[bucketCount];
        this.objCount = 0;
        this.loadFactorLimit = loadFactorLimit;
    }

    // Return a pointer to the bucket array
    public ListNode[] getBuckets() {
        return this.buckets;
    }

    // Returns true if this set is empty; otherwise returns false.
    public boolean isEmpty()
    {
        return (objCount == 0);
    }

    // Returns the number of elements in this set.
    public int size()
    {
        return objCount;
    }

    // Returns the current load factor (objCount / buckets)
    public double currentLoadFactor() {
        return (double)objCount / (double)buckets.length;
    }

    // Return the bucket index for the object
    public int whichBucket(Object obj) {
        return obj.hashCode() % this.buckets.length;
    }

    // Return true if the object exists in the set, otherwise false.
    // Use the .equals method to check equality.
    public boolean contains(Object obj) {
        /* -- IMPLEMENT THIS -- */
    }

    // Add an object to the set.
    // If the object already exists in the set you should *not* add another.
    // Return true if the object was added; false if the object already exists.
    // If an item should be added, add it to the beginning of the bucket.
    // After adding the element, check if the load factor is greater than the limit.
    // - If so, you must call rehash with double the current bucket size.
    public boolean add(Object obj) {
        /* -- IMPLEMENT THIS -- */
    }

    // Remove the object.  Return true if successful, false if the object did not exist
    public boolean remove(Object obj) {
        /* -- IMPLEMENT THIS -- */
    }

    // Rehash the set so that it contains the given number of buckets
    // Loop through all existing buckets, from 0 to length
    // rehash each object into the new bucket array in the order they appear on the original chain.
    public void rehash(int newBucketCount) {
        /* -- IMPLEMENT THIS -- */
    }

    // The output should be in the following format:
    // [ #1, #2 | { b#: v1 v2 v3 } { b#: v1 v2 } ]
    // #1 is the objCount
    // #2 is the number of buckets
    // For each bucket that contains objects, create a substring that indicates the bucket index
    // And list all of the items in the bucket (in the order they appear)
    public String toString() {

        /* -- IMPLEMENT THIS -- */

    }

}
