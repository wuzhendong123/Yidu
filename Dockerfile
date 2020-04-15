FROM tomcat:7.0.103-jdk8

MAINTAINER zhendong.wu

ENV YIDU_HOME=$CATALINA_HOME/yidu \
   PATH=$YIDU_HOME/scripts:$PATH


RUN mkdir -p $YIDU_HOME
#        && rm -r $CATALINA_HOME/webapps/ROOT

COPY target/YiDuNovel $CATALINA_HOME/webapps/ROOT

COPY docker/yidu/ $YIDU_HOME/

#RUN apk update && apk add zip bash && rm /var/cache/apk/* \
#        && dos2unix $YIDU_HOME/conf/* \
#        && dos2unix $YIDU_HOME/scripts/* \
#        && chmod +rw $YIDU_HOME \
#        && chmod +x $YIDU_HOME/scripts/yidu_run.sh \
#        && chmod +x $YIDU_HOME/scripts/yidu_config.sh


RUN  chmod +rw $YIDU_HOME \
        && chmod +x $YIDU_HOME/scripts/yidu_run.sh \
        && chmod +x $YIDU_HOME/scripts/yidu_config.sh


VOLUME ["/usr/local/tomcat/webapps/ROOT"]

CMD ["catalina.sh", "run"]
#CMD ["yidu_run.sh"]
#CMD ["catalina.sh", "jpda", "run"]