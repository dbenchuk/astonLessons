public class Park {
    public class Attraction {
        private String attractionInfo;
        private String openingHours;
        private int price;

        public Attraction(String attractionInfo, String openingHours, int price) {
            this.attractionInfo = attractionInfo;
            this.openingHours = openingHours;
            this.price = price;
        }
    }
}