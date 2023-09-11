FROM openjdk:17

WORKDIR /usr/src/app

# Copy Application
COPY build/libs/*.jar app.jar

# Set Timezone
RUN ln -fs /usr/share/zoneinfo/Asia/Seoul /etc/localtime

# Install Datadog
# RUN curl -L https://dtdg.co/latest-java-tracer -o dd-java-agent.jar

CMD java -jar app.jar