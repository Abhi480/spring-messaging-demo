/////////////////////
//SimpleQueueDriver//
/////////////////////
Exercise a simple "point to point" queue.
Unidirectional message flow w/no response from client.
A message w/a single String is produced in SimpleQueueDriver and converted to TextMessage by SimpleMessageConverter.
SimpleListener will process message by logging message content and some header values.
Errors at client end will be managed by SimpleErrorHandler.

JMS queue behavior demonstrated because only one listener will react to the message.

/////////////////////
//SimpleTopicDriver//
/////////////////////
Exercise a simple "publish/subscribe" topic.
Unidirectional message flow w/no response from client.
A message w/a single String is produced in SimpleTopicDriver and converted to TextMessage by SimpleMessageConverter.
SimpleListener will process message by logging message content and some header values.
Errors at client end will be managed by SimpleErrorHandler.

JMS topic behavior demonstrated because both listeners react to the message.
