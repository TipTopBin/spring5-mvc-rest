http://localhost:8080/swagger-ui.html

https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin
mvn jib:build -Djib.httpTimeout=120000
mvn compile jib:build \
    -Djib.to.auth.username=$USERNAME \
    -Djib.to.auth.password=$PASSWORD

#git Push an existing Git repository
cd existing_repo
git remote rename origin old-origin
git remote add origin git@gitlab.com:tiptopbin_case/erp-service.git
git push -u origin --all
git push -u origin --tags
