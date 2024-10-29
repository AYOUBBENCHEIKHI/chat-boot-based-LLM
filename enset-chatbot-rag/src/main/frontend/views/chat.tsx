import { Button, TextField } from "@vaadin/react-components";
import { ChatAiService } from "Frontend/generated/endpoints";
import { useState, } from "react";


export default function(){
	const [question,setQuestion]=useState<string>("");
	const [response,setResponse]=useState<string >("");
	async function send(){
		ChatAiService.ragChat(question).then(resp=>{
			setResponse(resp);
		});
	}
	return (
		<div className="p-m">
			<h3>CHAT BOOT</h3>
			
			<div>
				<TextField style ={{width:'80%'}} onChange={e=>setQuestion(e.target.value)}/>
				<Button theme = "primary" onClick = {send}>Send</Button>
			</div>
			<div>
				<pre>
					{response}
				</pre>
				
			</div>
		</div>
	)
}