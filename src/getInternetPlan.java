class getInternetPlan {
    public InternetPlan SubscribePlane(String PlanType){
        if(PlanType.equalsIgnoreCase("8MB")){
            return new EightMB();
        }else if (PlanType.equalsIgnoreCase("10MB")){
            return new TenMB();
        }else if (PlanType.equalsIgnoreCase("15MB")){
            return new FifteenMB();
        }
        return null;
    }
}
