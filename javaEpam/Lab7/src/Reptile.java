public class Reptile {
        private String name;
    private String size;
    private int weight;

        public Reptile(String name, String size, int weight) {
            this.name = name;
            this.size = size;
            this.weight = weight;
        }

        public String getHeaders() {
            return "name,size,weight";
        }

        public String toCSV() {
            return this.name + "," + this.size + "," + this.weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
}
