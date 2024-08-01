
fun main() {
    val schemaPath = "src/main/resources/schema.json"
    val payloadsDirectoryPath = "src/main/resources/payloads"
    val coverageThreshold = 92.75
    JSONCover.validateSchema(schemaPath, payloadsDirectoryPath, coverageThreshold)
}