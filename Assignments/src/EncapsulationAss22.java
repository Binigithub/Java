public class EncapsulationAss22 {

	private int tonerLevel;

    private int numberOfPages;

    private boolean isDuplex;

	

    public  EncapsulationAss22(int tonerLevel, boolean isDuplex){

        if(tonerLevel>=0&&tonerLevel<=100){

        this.tonerLevel=tonerLevel;

        }else {

            this.tonerLevel=-1;

        }

        this.isDuplex=isDuplex;

        this.numberOfPages=0;

    }

    public int addToner(int tonerAmount){

        if(tonerAmount>0 && tonerAmount<=100){

            if(tonerAmount+this.tonerLevel>100){

                return -1;

            }

            this.tonerLevel=tonerLevel+tonerAmount;

            return tonerLevel;

        }else{

            return -1;

        }

    }



    public int printPages(int pages){

        if(this.isDuplex){

            pages=pages/2+pages%2;

            System.out.println("Print in both page");

        }

        this.numberOfPages=this.numberOfPages+pages;

        return pages;

    }

    public int getNumberOfPagesPrinter(){

        return numberOfPages;

    }

	    

	

}