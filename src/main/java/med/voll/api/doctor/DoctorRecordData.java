package med.voll.api.doctor;

import med.voll.api.address.AddressData;

public record DoctorRecordData(String name, String email, String crm, Specialism specialism, AddressData address) {
}
