#if canImport(Testing)
import Testing
import Windows

@Suite("Windows Swift Export Smoke Tests")
struct WindowsExportTests {
    @Test("Swift module imports cleanly")
    func swiftModuleLoads() throws {
        #expect(true)
    }
}
#elseif canImport(XCTest)
import XCTest
import Windows

final class WindowsExportTests: XCTestCase {
    func testSwiftModuleLoads() throws {
        XCTAssertTrue(true, "Windows swift module imported cleanly")
    }
}
#endif

