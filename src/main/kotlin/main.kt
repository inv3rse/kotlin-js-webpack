import kotlinx.browser.document

@JsModule("src/main/kotlin/kotlin.svg")
external val kotlinLogo: String

fun main() {
    document.write("Hello, world!<br>")
    document.write("Image at \"${kotlinLogo}\"")
}