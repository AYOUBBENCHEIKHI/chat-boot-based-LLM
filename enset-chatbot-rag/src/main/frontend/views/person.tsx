import {AutoCrud} from "@vaadin/hilla-react-crud";
import {PersonService} from "Frontend/generated/endpoints";
import PersonModel from "Frontend/generated/org/enset_chatbot_rag/entities/PersonModel";

export default  function Person(){
    return(
      <AutoCrud service={PersonService} model={PersonModel}/>
    );
}