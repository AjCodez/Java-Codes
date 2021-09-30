class arrevod{
    public static void main(String[] args) {
        int ar[]={1,2,3,4,55,54,3,456,77,43,5,6,7,6,5,676,5,9};
        
        int ev=0;
        int od=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                ev++;
            }
            else{
                od++;
            }
        }
        System.out.print("Number of even : ");
        System.out.println(ev);
        System.out.print("Number of odd : ");
        System.out.println(od);
    }
}