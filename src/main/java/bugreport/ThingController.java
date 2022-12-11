package bugreport;


import bugreport.generated.api.ThingsApi;
import bugreport.generated.model.Thing;

class ThingController implements ThingsApi {

    @Override
    public Thing thingsCreate() {
        return new Thing().name("i should return http 201");
    }
}