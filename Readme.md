#AWS Lambda Demo

Small demo of AWS lambda usage.

Handlers:

- Demo handler - log incoming event
- S3Handler - log incoming S3 event data(bucket,sourceKey)


##Build
```yaml
./gradlew clean build
```

Deployment zip is located build/distributions directory.
