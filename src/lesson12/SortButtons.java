//package lesson12;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//    public class SortButtons {
//        public void sortByPriceFromTo(TreeSet<Kettle> kettles) {
//            TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
//                @Override
//                public int compare(Kettle o1, Kettle o2) {
//                    if (o1.getPrice() != o2.getPrice()) {
//                        return Double.compare(o1.getPrice(), o2.getPrice());
//                    }
//                    if (o1.getWeight() != o2.getWeight()) {
//                        return o1.getWeight() - o2.getWeight();
//                    }
//                    if (o1.getYear() != o2.getYear()) {
//                        return o1.getYear() - o2.getYear();
//                    }
//                    if (!o1.getMetal().equals(o2.getMetal())) {
//                        return o1.getMetal().compareTo(o2.getMetal());
//                    }
//                    return 0;
//                }
//            });
//        }
//    }