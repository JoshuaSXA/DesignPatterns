package IteratorPattern;

public class NamesRepository implements Container {

    private String[] names = {"Ancy", "Bob", "Claire", "David"};

    @Override
    public Iterator getIterator() {

        return new NameIterator();

    }

    private class NameIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {

                return true;

            }

            return false;

        }

        @Override
        public Object next() {

            if(this.hasNext()) {

                return names[index++];

            }
            return null;
        }

    }

}
