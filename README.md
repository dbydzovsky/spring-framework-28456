# spring-framework-28456

This is a repo with reproduction steps to simulate https://github.com/spring-projects/spring-framework/issues/28456 SPEL: Not unique cache key for PropertyOrFieldReference when evaluating fragment #28456

1. start an app on localhost:8090
2. login with user 'user' and password that is printed in console
3. access localhost:8090/broken to simulate an issue
4. access localhost:8090/alright to see our workaround for this issue
