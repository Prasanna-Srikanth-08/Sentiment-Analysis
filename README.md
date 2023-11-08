NLP Sentiment Analysis Documentation:-

Natural Language Processing (NLP) is a field of artificial intelligence (AI) that focuses on the interaction between computers and human language. NLP tasks include various language-related applications such as text classification, language translation, sentiment analysis, and more.

Sentiment analysis, also known as opinion mining, is a specific NLP task that involves determining the sentiment or emotional tone of a piece of text, typically classifying it as positive, negative, or neutral. Sentiment analysis has numerous real-world applications, such as understanding customer feedback, social media monitoring, and market research.

In this small application I have created an endpoint where user can give Messages and they will get the appropriate result processed by the Sentiment analaysis. 


Endpoint Details:-

Url:-

<http://localhost:8080/feedback/process>

In local whenever application runs, it starts on port 8080. If user wishes to change the port number, add the property “server.port”

in application.properties.

Dependancies:-

	<dependency>
		<groupId>edu.stanford.nlp</groupId>
		<artifactId>stanford-corenlp</artifactId>
		<version>4.5.4</version>
	</dependency>

	<dependency>
		<groupId>edu.stanford.nlp</groupId>
		<artifactId>stanford-corenlp</artifactId>
		<version>4.5.4</version>
		<classifier>models</classifier>
	</dependency>

Request Body:-

{

"message": "The sun rises in the east and sets in the west. Water boils at 100 degrees Celsius at sea level. The Great Wall of China is visible from space. Bees play a crucial role in pollinating many of our food crops. The Eiffel Tower is located in Paris, France. The Earth is the third planet from the sun in our solar system. The human body is composed of approximately 60% water. William Shakespeare is often regarded as one of the greatest playwrights in history. The periodic table consists of 118 known chemical elements.   Mount Everest is the highest peak in the world, standing at 8,848 meters (29,029 feet) above sea level. The United States declared independence from Britain on July 4, 1776. DNA carries genetic information in all living organisms. The fastest land animal is the cheetah, capable of running at speeds up to 60-70 miles per hour. The Great Barrier Reef is the world's largest coral reef system, located off the coast of Australia. The first human to set foot on the moon was Neil Armstrong in 1969 during the Apollo 11 mission. I don't like rainy weather."

}


Response:-

{

"Neutral": [

"Water boils at 100 degrees Celsius at sea level.",

"Bees play a crucial role in pollinating many of our food crops.",

"The Eiffel Tower is located in Paris, France.",

"The Earth is the third planet from the sun in our solar system.",

"William Shakespeare is often regarded as one of the greatest playwrights in history.",

"The periodic table consists of 118 known chemical elements.",

"The United States declared independence from Britain on July 4, 1776.",

"DNA carries genetic information in all living organisms.",

"The first human to set foot on the moon was Neil Armstrong in 1969 during the Apollo 11 mission."

],

"Negative": [

"The fastest land animal is the cheetah, capable of running at speeds up to 60-70 miles per hour.",

"I don't like rainy weather."

],

"Positive": [

"The sun rises in the east and sets in the west.",

"The Great Wall of China is visible from space.",

"The human body is composed of approximately 60% water.",

"Mount Everest is the highest peak in the world, standing at 8,848 meters (29,029 feet) above sea level.",

"The Great Barrier Reef is the world's largest coral reef system, located off the coast of Australia."

]

}

