import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.*;

public class fillylist implements Philatelist {

    private final List<PostStamp> collects = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            collects.add(postStamp);
        }
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collects.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp postStamp : collects) {
            System.out.println(postStamp.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double price) {
        for (PostStamp postStamp : collects) {
            if (postStamp.getMarketPrice() > price) {
                System.out.println(postStamp.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return collects.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (PostStamp postStamp : collects) {
            if (postStamp.getName().equals(s)) {
                return true;
            }
        }
        return false;
    } // I probably did this wrong but it passes the test

    @Override
    public double calculateTotalMarketPrice() {
        double totalPrice = 0;
        for (PostStamp postStamp : collects) {
            totalPrice += postStamp.getMarketPrice();
        }
        return totalPrice;
    }

    @Override
    public double getAveragePostStampPrice() {
        double totalPrice = 0;
        for (PostStamp postStamp : collects) {
            totalPrice += postStamp.getMarketPrice();
        }
        return totalPrice / collects.size();
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        PostStamp outputStamp = collects.getFirst();
        for (PostStamp postStamp : collects) {
            if (postStamp.getMarketPrice() > outputStamp.getMarketPrice()) {
                outputStamp = postStamp;
            }
        }
        return outputStamp;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String nameFragment) {
        List<PostStamp> output = new ArrayList<>();
        for (PostStamp postStamp : collects) {
            if (postStamp.getName().contains(nameFragment)) {
                output.add(postStamp);
            }
        }
        return output;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        //collects.sort((a, b) -> a.getName().compareTo(b.getName()));
        collects.sort(Comparator.comparing(PostStamp::getName));

        return collects;
    }
}
